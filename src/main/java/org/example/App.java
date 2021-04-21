package org.example;

import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class App {
  // run this with the vm option -Djava.security.debug=certpath
  public static void main(String[] args) {
    OkHttpClient client = new OkHttpClient.Builder().build();

    Request request = new Request.Builder()
      .method("GET", null)
      .url("https://sonarsource-bitbucket-test.valiantys.net/rest/api/1.0/repos")
      .build();

    try (Response response = client.newCall(request).execute()) {
      System.out.println(response.code());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
