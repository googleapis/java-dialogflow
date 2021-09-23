/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dialogflow;

// [START dialogflow_es_webhook]

import com.google.cloud.functions.HttpFunction;
import com.google.cloud.functions.HttpRequest;
import com.google.cloud.functions.HttpResponse;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonElement;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedWriter;
import java.io.Exception;

public class Webhook {

  public void handleWebhook (HttpRequest request, HttpResponse response) throws Exception {
    JsonParser parser = new JsonParser();
    Gson gson = new GsonBuilder().create();
    
    JsonObject job = gson.fromJson(request.getReader(), JsonObject.class);
    String str=job.getAsJsonObject("queryResult").getAsJsonObject("intent").getAsJsonPrimitive("displayName").toString();
    JsonObject o = null;
    String a = "\"Default Welcome Intent\"";
    String b = "\"get-agent-name\"";

    if(str.equals(a)){
      o = parser.parse("{\"fulfillmentMessages\": [ { \"text\": { \"text\": [ \"Hello from a Java GCF Webhook\" ] } } ] }").getAsJsonObject();
    } else if(str.equals(b)){
      o = parser.parse("{\"fulfillmentMessages\": [ { \"text\": { \"text\": [ \"My name is Flowhook\" ] } } ] }").getAsJsonObject();
    } else {
      o = parser.parse("{\"fulfillmentMessages\": [ { \"text\": { \"text\": [ \"Sorry I didn't get that\" ] } } ] }").getAsJsonObject();
    }

    BufferedWriter writer = response.getWriter();
    writer.write(o.toString());
  }
}
// [END dialogflow_es_webhook]
