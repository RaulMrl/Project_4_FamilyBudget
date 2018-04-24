package main.controller;

import main.repository.MemberRepository;
import main.exceptions.InvalidBudgetException;
import main.exceptions.InvalidTypeException;
import main.model.Entry;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class Lab3 {

    private MemberRepository mr;
    @Before
    public void setUp() throws Exception {
        mr = new MemberRepository();
    }

    @Test
    public void test_1() {
        int value = 200;
        String type = "income";
        Entry entry1 = new Entry(type, value, 1);

        try {
            mr.addEntry(entry1);
        } catch (Exception e) {
            fail("Assertion failed");
        }

    }

    @Test
    public void test_2() {
        int value = -1;
        String type = "income";
        Entry entry2 = new Entry(type, value, 2);

        try {
            mr.addEntry(entry2);
        } catch (Exception e) {
            fail("Assertion failed");
        }

    }
    @Test
    public void test_3() {
        int value = 200;
        String type = "name";
        Entry entry3 = new Entry(type, value, 3);

        try {
            mr.addEntry(entry3);
        } catch (Exception e) {
            fail("Assertion failed");
        }

    }

}
