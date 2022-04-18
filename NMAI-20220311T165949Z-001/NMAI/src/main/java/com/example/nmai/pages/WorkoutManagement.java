package com.example.nmai.pages;

import java.io.IOException;
import java.util.*;

import com.example.nmai.Data.*;
import okhttp3.*;

public class WorkoutManagement {

    private ArrayList<Workout> workoutList;
    private ArrayList<String> bodypartList;
    private ArrayList<String> equipmentList;
    private ArrayList<String> targetList;

    public WorkoutManagement() throws IOException {
        this.workoutList = new ArrayList<>();
        this.bodypartList = new ArrayList<>();
        this.equipmentList = new ArrayList<>();
        this.targetList = new ArrayList<>();
    }

    private ArrayList<Workout> createWorkoutList(String response) {
        ArrayList<Workout> list = new ArrayList<>();
        ArrayList<String> temp = new ArrayList<>();
        String[] res = response.replaceAll("[\"\\{\\[\\}\\]]", " ").replaceAll(" :", " ").replaceAll(" , ","  ").split("  ");

        for (String string : res) {
            String result = string.trim();
            if (!result.equals("")) {
                if (!result.equals("bodyPart") && !result.equals("equipment") && !result.equals("gifUrl") && !result.equals("id") && !result.equals("name") && !result.equals("target")) {
                    temp.add(string.trim());
                }
            }
        }

        for (int i = 0; i < temp.size(); i++) {
            if (i % 6 == 0 && i + 5 < temp.size()) {
                Workout workout = new Workout();
                workout.setBodyPart(temp.get(i));
                workout.setEquipment(temp.get(i + 1));
                workout.setGifURL(temp.get(i + 2));
                workout.setId(temp.get(i + 3));
                workout.setName(temp.get(i + 4));
                workout.setTarget(temp.get(i + 5));
                list.add(workout);
            }
        }
        return list;
    }

    private void setWorkoutList() throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url("https://exercisedb.p.rapidapi.com/exercises").get().addHeader("x-rapidapi-host", "exercisedb.p.rapidapi.com").addHeader("x-rapidapi-key", "24c7aefa92msh65d245d3e2bf9d2p1359acjsn201d3a869065").build();
        Response response = client.newCall(request).execute();
        assert response.body() != null;
        this.workoutList = createWorkoutList(response.body().string());
    }

    private void setBodyPartList() throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url("https://exercisedb.p.rapidapi.com/exercises/bodyPartList").get().addHeader("x-rapidapi-host", "exercisedb.p.rapidapi.com").addHeader("x-rapidapi-key", "24c7aefa92msh65d245d3e2bf9d2p1359acjsn201d3a869065").build();
        Response response = client.newCall(request).execute();
        for (String string : response.body().string().split("[^0-9A-Za-z ]")) {
            if (!string.equals("")) {
                this.bodypartList.add(string);
            }
        }
    }

    private void setEquipmentList() throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url("https://exercisedb.p.rapidapi.com/exercises/equipmentList").get().addHeader("x-rapidapi-host", "exercisedb.p.rapidapi.com").addHeader("x-rapidapi-key", "24c7aefa92msh65d245d3e2bf9d2p1359acjsn201d3a869065").build();
        Response response = client.newCall(request).execute();
        for (String string : response.body().string().split("[^0-9A-Za-z/ ]")) {
            if (!string.equals("")) {
                this.equipmentList.add(string);
            }
        }

    }

    private void setTargetList() throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url("https://exercisedb.p.rapidapi.com/exercises").get().addHeader("x-rapidapi-host", "exercisedb.p.rapidapi.com").addHeader("x-rapidapi-key", "24c7aefa92msh65d245d3e2bf9d2p1359acjsn201d3a869065").build();
        Response response = client.newCall(request).execute();
        for (String string : response.body().string().split("[^0-9A-Za-z ]")) {
            if (!string.equals("")) {
                this.targetList.add(string);
            }
        }
    }

    public ArrayList<Workout> getWorkoutList() throws IOException {
        setWorkoutList();
        return workoutList;
    }

    public ArrayList<String> getBodypartList() throws IOException {
        setBodyPartList();
        return bodypartList;
    }

    public ArrayList<String> getEquipmentList() throws IOException {
        setEquipmentList();
        return equipmentList;
    }

    public ArrayList<String> getTargetList() throws IOException {
        setTargetList();
        return targetList;
    }

    public ArrayList<Workout> getListByBodyPart(String bodyPart) throws IOException {
        ArrayList<Workout> list = new ArrayList<>();
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url("https://exercisedb.p.rapidapi.com/exercises/bodyPart/" + bodyPart).get().addHeader("x-rapidapi-host", "exercisedb.p.rapidapi.com").addHeader("x-rapidapi-key", "24c7aefa92msh65d245d3e2bf9d2p1359acjsn201d3a869065").build();
        Response response = client.newCall(request).execute();
        list = createWorkoutList(response.body().string());
        return list;
    }

    public ArrayList<Workout> getListByName(String name) throws IOException {
        ArrayList<Workout> list = new ArrayList<>();
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url("https://exercisedb.p.rapidapi.com/exercises/name/" + name).get().addHeader("x-rapidapi-host", "exercisedb.p.rapidapi.com").addHeader("x-rapidapi-key", "24c7aefa92msh65d245d3e2bf9d2p1359acjsn201d3a869065").build();
        Response response = client.newCall(request).execute();
        list = createWorkoutList(response.body().string());
        return list;
    }

    public ArrayList<Workout> getListByTarget(String target) throws IOException {
        ArrayList<Workout> list = new ArrayList<>();
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url("https://exercisedb.p.rapidapi.com/exercises/target/" + target).get().addHeader("x-rapidapi-host", "exercisedb.p.rapidapi.com").addHeader("x-rapidapi-key", "24c7aefa92msh65d245d3e2bf9d2p1359acjsn201d3a869065").build();
        Response response = client.newCall(request).execute();
        list = createWorkoutList(response.body().string());
        return list;
    }

    public ArrayList<Workout> getListByEquipment(String equipment) throws IOException {
        ArrayList<Workout> list = new ArrayList<>();
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url("https://exercisedb.p.rapidapi.com/exercises/equipment/" + equipment).get().addHeader("x-rapidapi-host", "exercisedb.p.rapidapi.com").addHeader("x-rapidapi-key", "24c7aefa92msh65d245d3e2bf9d2p1359acjsn201d3a869065").build();
        Response response = client.newCall(request).execute();
        list = createWorkoutList(response.body().string());
        return list;
    }
}
