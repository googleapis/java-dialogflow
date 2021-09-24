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

import static com.google.common.truth.Truth.assertThat;
import static java.nio.charset.StandardCharsets.UTF_8;
import static org.mockito.Mockito.when;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ExampleIT {

    private ByteArrayOutputStream stdOut;

    private static BufferedReader getRequestJSONReader() {
    byte[] b =
        ("{
            \"queryResult\": {
              \"intent\": {
                \"name\": \"projects/galstarter-316823/agent/intents/00c2877d-2440-447f-8dc1-045623a55bd4\",
                \"displayName\": \"Default Welcome Intent\"
              },
            },
          }")
            .getBytes(UTF_8);
    InputStream is = new ByteArrayInputStream(b);
    return new BufferedReader(new InputStreamReader(is, UTF_8));
  }


  @Before
  public void setUp() throws IOException {

    stdOut = new ByteArrayOutputStream();
    System.setOut(new PrintStream(stdOut));
  }

  @Test
  public void testWebhook() throws IOException {
    when(request.getReader()).thenReturn(getRequestJSONReader());
    Example.service()
    assertThat(stdOut.toString()).contains("Hello from a Java GCF Webhook");

  }
}