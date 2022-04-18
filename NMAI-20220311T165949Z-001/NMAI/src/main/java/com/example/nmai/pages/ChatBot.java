package com.example.nmai.pages;

import com.example.nmai.Data.DataOfChatBot;

import java.util.*;

public class ChatBot {
    private String bot;
    private String human;
    private ArrayList<String> options;
    private int numOfOption;
    private final ArrayList<String> conversation;

    public ChatBot(String bot, String human) {
        this.bot = bot;
        this.human = human;
        this.conversation = new ArrayList<>();
        this.options = new ArrayList<>();
        this.numOfOption = 0;
    }

    public ChatBot() {
        this.bot = "";
        this.human = "";
        this.conversation = new ArrayList<>();
        this.options = new ArrayList<>();
        this.numOfOption = 0;
    }

    public String getBot() {
        return bot;
    }

    public void setBot(String bot) {
        this.bot = "Bot: " + bot;
    }

    public String getHuman() {
        return human;
    }

    public void setHuman(String human) {
        this.human = "Human: " + human;
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    public void setOptions(ArrayList<String> options) {
        this.options = options;
    }

    public ArrayList<String> getConversation() {
        return conversation;
    }

    public int getNumOfOption() {
        return numOfOption;
    }

    public void setNumOfOption(int numOfOption) {
        this.numOfOption = numOfOption;
    }

    public void setAnswerForQuestion(String question, String answer) {
        setBot(question);
        setHuman(answer);
    }


    // size of answer list and size of option list is same
    public void setAnswerForEachOption(ArrayList<String> answer) {
        setBot(answer.get(getNumOfOption()));
        System.out.println(getBot());
        getConversation().add(getBot());
    }

    public String getBotMessList(ArrayList<String> list) {
        String result = "";
        for (String mess : list) {
            setBot(mess);
            getConversation().add(getBot());
            if (list.indexOf(mess) == list.size() - 1) {
                result += getBot();
            } else result += getBot() + "\n";
        }
        return result;
    }

    public void printConversation() {
        System.out.println("Print history of the conversation: ");
        for (String s : getConversation()) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        String a = "bot: 1233";
        String b = "bot:";
        System.out.println(a.substring(0, 4));
        System.out.println(a.substring(0, 4).matches(b));
    }
}
