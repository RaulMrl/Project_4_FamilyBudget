package main.controller;

import main.model.Member;
import main.repository.MemberRepository;
import org.junit.Before;
import org.junit.Test;

public class MemberRepositoryTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		MemberRepository memberRepository =new MemberRepository();
		
		Member member=new Member("name1","id1");
		memberRepository.addMember(member);
		assert(memberRepository.getAllMembers().size()==4);
		
	}
	@Test
	public void test2(){
		MemberRepository memberRepository =new MemberRepository();
		Member member=new Member("name1","id1");
		memberRepository.addMember(member);
		assert(memberRepository.getAllMembers().get(3).getName().equals(member.getName()));
	}




}
