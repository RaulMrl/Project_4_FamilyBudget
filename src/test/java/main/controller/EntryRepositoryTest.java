package main.controller;

import main.model.Entry;
import main.repository.MemberRepository;
import org.junit.Before;
import org.junit.Test;


public class EntryRepositoryTest {
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void test() {
        MemberRepository memberRepository =new MemberRepository();

        Entry entry=new Entry("income",100,10);
        memberRepository.addEntry(entry);
        assert(memberRepository.getAllEntries().size()==10);
    }
    @Test
    public void test2(){
        MemberRepository memberRepository =new MemberRepository();
        Entry entry=new Entry("income",100,10);
        memberRepository.addEntry(entry);
        assert(memberRepository.getAllEntries().get(9).getIdMember()==10);
        assert("income".equals(memberRepository.getAllEntries().get(9).getType()));
    }
}
