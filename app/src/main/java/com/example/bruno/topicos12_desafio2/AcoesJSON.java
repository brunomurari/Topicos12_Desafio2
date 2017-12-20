package com.example.bruno.topicos12_desafio2;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bruno on 19/12/2017.
 */

public class AcoesJSON {
    public List<Foo> getFromJSON(String json) {
        List<Foo> fooList = new ArrayList<Foo>();

        try {
            JSONObject jo = new JSONObject(json);
            JSONArray fooArray = jo.getJSONArray("acoes_sociais");

            for (int i = 0; i < fooArray.length(); i++) {
                JSONObject fooJSONObject = fooArray.getJSONObject(i);

                Foo foo = new Foo();
                foo.setId(fooJSONObject.getInt("id"));
                foo.setName(fooJSONObject.getString("name"));
                foo.setImage(fooJSONObject.getString("image"));
                foo.setDescription(fooJSONObject.getString("description"));
                foo.setSite(fooJSONObject.getString("site"));

                fooList.add(foo);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return fooList;
    }


}
 /*   String resposta = HttpConnections.get(" http://rate-exchange-1.appspot.com/currency?from=EUR&to=DKK");
    JSONObject obj = new JSONObject(resposta);
    Long id = obj.getString("id");
    String name = obj.getDouble("name");
    String image = obj.getString("image");
 */