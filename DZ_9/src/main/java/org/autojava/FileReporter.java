package org.autojava;

import java.io.*;
import java.util.HashMap;
import java.net.*;
import java.util.Map;

public class FileReporter {
    private HashMap<String, Integer> Dictionry = new HashMap<>();

    public HashMap<String, Integer> getDictionry() {
        return Dictionry;
    }

    private static BufferedReader getBufferedReader() throws IOException {
        URL url;
        try {
            url = new URL("http://127.0.0.1/123.txt");
        } catch (MalformedURLException ex) {
            throw new RuntimeException(ex);
        }
        HttpURLConnection httpCon;
        try {
            httpCon = (HttpURLConnection) url.openConnection();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        try {
            httpCon.setRequestMethod("GET");
        } catch (ProtocolException ex) {
            throw new RuntimeException(ex);
        }
        return new BufferedReader(
                new InputStreamReader(httpCon.getInputStream()));
    }


    public void setDictionry(){
        try {
            BufferedReader reader = getBufferedReader();
            {
                for (String q; (q = reader.readLine()) != null; ) {
                    String[] arr = q.replaceAll("[^a-zA-Z0-9]", " ").split("\\s");
                    saveDict(arr);
                }
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    private void saveDict(String[] arr) {
        for (String h: arr) {
             if (isExist(h)) {
                int k = Dictionry.get(h);
                Dictionry.replace(h, k + 1);
            } else {
               Dictionry.put(h, 1);
           }
        }
    }

    private boolean isExist(String h) {
        if (Dictionry == null) {
            return false;
        } else return Dictionry.containsKey(h);
    }

    public void printDict() {
        for (Map.Entry<String, Integer> q: Dictionry.entrySet()) {
            System.out.printf("Key: %s,  Value: %s \n", q.getKey(), q.getValue().toString());
        }
        System.out.println();
    }

    private void makeFile(){
        try {
            File myObj = new File("filename.txt");
            myObj.createNewFile();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void writeFile() {
        makeFile();
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            for (Map.Entry<String, Integer> q: Dictionry.entrySet()) {
                String s = "Key: " + q.getKey() +"  Value: " + q.getValue().toString() +"\n";
                myWriter.write(s);
            }

            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
