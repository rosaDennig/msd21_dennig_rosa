/*
 * Project: Assignment 5 Datastructures and Algorithms Stack
 * Author:  Anonym
 * Last Change:01.01.2022
 */

package com.da.datastructures;

/**
 * Class that holds the hash table implementation. The hash table is of fixed size and contains <int,String> pairs.
 * Open addressing with quadratic probing (c1=c2=1) is utilized in combination with the division method to hash
 * the keys.
 */

public class MyHashTable {

    /**
     * Hash table size
     */
    private final int hash_table_size;

    /**
     * Generates a hash table based on the given size.
     * @param hash_table_size fixed size of the hash table.
     */
    public MyHashTable(int hash_table_size) {
        this.hash_table_size=hash_table_size;
    }


    /**
     * Implementation that inserts a <key,value>-pair into the hash table.
     * There are 3 cases:
     *  1.If the key and resulting hash have not been used/assigned previously, the <key,value>-pair is simply
     *  added to the hash table.
     *  2.If the key is already contained within the hash table, then the old value of that entry is replaced
     *  with the new value.
     *  3. If the key produces a hash that is already used by another <key,value>-pair, then a new index is calculated.
     * @param key the key
     * @param value the value
     */
    public void put(int key, String value){
        //TODO
    }


    /**
     * Returns the value of the <key,value>-pair based on the key.
     * @param key the key
     * @return the value
     */
    public String get(int key){
        //TODO
        return null;
    }

    /**
     * Removes a <key,value>-pair from the table based on the key.
     * Removing means, that the hash table contains a tombstone at the index.
     * @param key the key
     */
    public void remove(int key){
        // TODO
    }

    /**
     * Returns a Boolean that signifies whether a key is stored within the hash table.
     * @param key the key
     * @return <code>true</code> if the key is stored in the table;
     *         <code>false</code> otherwise.
     */
    public boolean contains(int key){
        //TODO
        return false;
    }

    /**
     * Hash function based on the division method and quadratic probing with c1=c2=1 (see lecture slides).
     * @param key the key
     * @param probingNumber the probing number
     * @return the hash value of the key
     */
    private int hash(int key, int probingNumber){
        //TODO
        return -1;
    }

    /**
     * Returns a string representation of the hashtable. Each array entry is on a separate line starting with
     * "[ index ]:". This is followed by:
     * <ul>
     *     <li>nothing if the index is free.</li>
     *     <li>the <key,value> pair in the form key,value, if the index is occupied.</li>
     *     <li>the string "removed" if an element at the index has been deleted (=tombstone).</li>
     * </ul>
     * @return the String representation of the hash table
     */
    public String toString(){
        //TODO
        return "";
    }
}
