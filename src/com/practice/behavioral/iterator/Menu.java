package com.practice.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu {
    List<Item> menuitems;
    public Menu(){
        this.menuitems = new ArrayList<>();
    }
    public void addItem(Item item){
        menuitems.add(item);
    }

    public Iterator createIterator(){
        return new MenuIterator();
    }


    class MenuIterator implements Iterator<Item>{
        int currentIndex = 0;
        @Override
        public boolean hasNext() {
            if(currentIndex>=menuitems.size())
                return false;
            return true;
        }

        @Override
        public Item next() {
            return menuitems.get(currentIndex++);
        }

        @Override
        public void remove() {
            menuitems.remove(--currentIndex);
        }

        public Item current(){
            return menuitems.get(currentIndex);
        }

        public Item first(){
            return menuitems.get(0);
        }
    }
}
