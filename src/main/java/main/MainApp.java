package main;

import collections.CollectionsApp;
import streams.StreamsApp;

public class MainApp {

    public static void main(String[] args) {
        System.out.println("Streams: ");
        StreamsApp streamsApp = new StreamsApp();
        streamsApp.test1();
        streamsApp.test2();

        System.out.println("\nCollections:");
        CollectionsApp collectionsApp = new CollectionsApp();
        collectionsApp.test1();
        collectionsApp.test2();
        collectionsApp.test3();
        collectionsApp.test4();
        collectionsApp.test5();
    }
}
