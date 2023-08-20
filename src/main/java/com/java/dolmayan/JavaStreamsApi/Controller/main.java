package com.java.dolmayan.JavaStreamsApi.Controller;

import org.json.*;
import java.io.*;

public class main {
    public static JSONObject obj;
    public static void main(String args[]){
        try {
            obj = new JSONObject( fileToString("src/main/resources/questions.json") );

            JSONArray questionsArray = obj.getJSONArray("question");

            for(int i = 0; i < questionsArray.length(); i++){
                System.out.println((i+1) + ") " + questionsArray.getJSONObject(i).getString("questionText"));

                if(questionsArray.getJSONObject(i).getString("type").equals("mcq")){
                    JSONArray answersArray = questionsArray.getJSONObject(i).getJSONArray("options");

                    for(int x = 0; x < answersArray.length(); x++){
                        System.out.println("  " + (x+1) + ") " + answersArray.get(x));
                    }
                }

                System.out.println();
                System.out.println("Answer is: " + questionsArray.getJSONObject(i).getString("answer"));

                System.out.println("-----------------");
                System.out.println();
            }


        } catch(Exception e){
            System.out.println("Error building JSON");
        }

    }


    private static String fileToString(String fileName){
        String str = "";
        try {
            InputStream is = new FileInputStream(fileName);
            BufferedReader buf = new BufferedReader(new InputStreamReader(is));

            String line = buf.readLine();
            StringBuilder sb = new StringBuilder();

            while (line != null) {
                sb.append(line).append("\n");
                line = buf.readLine();
            }

            String fileAsString = sb.toString();

            return fileAsString;

        } catch(Exception e){
            System.out.println("Error");
        }

        return str;
    }
}