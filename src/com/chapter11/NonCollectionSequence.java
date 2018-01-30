package com.chapter11;

import java.util.*;

public class NonCollectionSequence extends PetSequence implements Iterable {
        public Iterator<Pet> iterator() {
            return new Iterator<Pet>() {
                private int index = 0;
                public boolean hasNext() {
                    return index < pets.length;
                }
                public Pet next() { return pets[index++]; }
                public void remove() {
                    throw new UnsupportedOperationException();
                }
            };
        }
        public static Iterable<Pet> reversed() {
            return new Iterable<Pet>() {
                public Iterator<Pet> iterator() {
                    return new Iterator<Pet>() {
                        int current = pets.length - 1;
                        public boolean hasNext() {
                            return current > -1;
                        }
                        public Pet next() {
                            return pets[current--];
                        }
                        public void remove() {
                            throw new
                                    UnsupportedOperationException();
                        }
                    };
                }
            };
        }
        public static Iterable<Pet> randomized() {
            return new Iterable<Pet>() {
                public Iterator<Pet> iterator() {
                    List<Pet> shuffled = new
                            ArrayList<Pet>(Arrays.asList(pets));
                    Collections.shuffle(shuffled, new Random());
                    return shuffled.iterator();
                }
            };
        }
    NonCollectionSequence() {
        System.out.print("pets: ");
        for(Pet p : NonCollectionSequence.pets)
            System.out.print(p + " ");
        System.out.println();
        System.out.println("reversed: ");
        for(Pet p : NonCollectionSequence.reversed())
            System.out.print(p + " ");
        System.out.println();
        System.out.print("randomized: ");
        for(Pet p : NonCollectionSequence.randomized())
            System.out.print(p + " ");
    }
}
