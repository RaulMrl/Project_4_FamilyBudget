package main.controller;

import main.model.Entry;
import main.repository.MemberRepository;
import org.junit.Test;


public class NotAEntryRepositoryTest {
    @Test
    public void test3(){
        MemberRepository memberRepository =new MemberRepository();
        Entry entry=new Entry("income",100,5);
        memberRepository.addEntry(entry);
        assert(memberRepository.getAllEntries().size()==9);
    }
}
