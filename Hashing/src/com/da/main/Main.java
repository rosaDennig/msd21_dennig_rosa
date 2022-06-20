/*
 * Project: Assignment 5 Datastructures and Algorithms Stack
 * Author:  Anonym
 * Last Change:01.01.2022
 */

package com.da.main;

import com.da.datastructures.MyHashTable;
import com.da.util.IOHandler;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * com.da.main.Main class that is the entry point of the hash table program.
 * Recommendation: Do not change this.
 * @author Koitz-Hristov
 */
public class Main {

    public static StringBuilder result = new StringBuilder();

    public static void main(String[] args) {
        //check if necessary test case input file is provided
        if (args.length != 1) {
            System.err.println("Error: Please specify an input file");
            System.exit(-1);
        }

        // read input
        IOHandler ioHandler = new IOHandler();
        List<String> input = ioHandler.readInputFile(args[0]);
        System.out.println("Input File: " + args[0]);

        //init hash table with hash table size
        int hash_table_size = Integer.parseInt(input.get(0));
        MyHashTable myHashTable = new MyHashTable(hash_table_size);

        parseTestcaseContent(input, myHashTable);
        System.out.println(result);
        ioHandler.printResultToOutputFile(result.toString(), args[0]);
    }

    /**
     * Parses the test case line by line, calls the corresponding <code>MyHashTable</code> methods.
     *
     * @param input       the stack test case as a list with each element representing one line of the input test file
     * @param myHashTable the instance of the hash table class
     */
    private static void parseTestcaseContent(List<String> input, MyHashTable myHashTable) {
        //read every input line and parse the command and argument
        for (int i = 1; i < input.size(); i++) {
            String line = input.get(i);
            int key = -1;
            //parse digit from input which represents the key
            Pattern digit = Pattern.compile("\\d+");
            Matcher digit_matcher = digit.matcher(line);
            while (digit_matcher.find()) {
                key = Integer.valueOf(digit_matcher.group());
            }
            //parse which hash table method to call
            if (line.contains("get")) {
                String value = myHashTable.get(key);
                addGetToResult(line, value);
            } else if (line.contains("contains")) {
                boolean contained = myHashTable.contains(key);
                addContainsToResult(line, Boolean.toString(contained));
            } else if (line.contains("remove")) {
                myHashTable.remove(key);
                addPutOrRemoveToResult(line, myHashTable);
            }
            //put
            else {
                //parse string value between parentheses
                String value = "";
                Pattern value_int = Pattern.compile(",(.*?)\\)");
                Matcher value_int_matcher = value_int.matcher(line);
                while (value_int_matcher.find()) {
                    value = value_int_matcher.group(1);
                }
                myHashTable.put(key, value);
                addPutOrRemoveToResult(line, myHashTable);
            }
        }
    }

    /**
     * Format the result output of the get command as needed for automated testing.
     *
     * @param line  input command
     * @param value command result
     */
    public static void addGetToResult(String line, String value) {
        result.append(line).append("->").append(value).append("\n\n");
    }

    /**
     * Format the result output of the contains command as needed for automated testing.
     *
     * @param line  the input command
     * @param value the command result
     */
    public static void addContainsToResult(String line, String value) {
        result.append(line).append("->").append(value).append("\n\n");
    }

    /**
     * Format the result output of the put and remove command as needed for automated testing.
     *
     * @param line  the input command
     * @param table the hash table instance
     */
    public static void addPutOrRemoveToResult(String line, MyHashTable table) {
        result.append(line).append("\n");
        result.append(table.toString()).append("\n");
    }
}
