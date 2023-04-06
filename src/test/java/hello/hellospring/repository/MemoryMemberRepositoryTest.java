package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.*;

class MemoryMemberRepositoryTest {
    MemoryMemberRepository repository = new MemoryMemberRepository();

    ////data를 clean해줘야함, test가 끝날때 마다 repository를 지워줘야함.
    //메서드가 실행이 끝날 때 마다 동작을 하는 콜백메서드
    @AfterEach
    public void afterEach() {
        repository.clearStore();
    }



    @Test
    public void save () {
        Member member = new Member();
        member.setName("String");

        repository.save(member);

        Member result = repository.findById(member.getId()).get();
       // System.out.println("result = " + (result == member));
       // Assertions.assertEquals(member, result); junit
        //assertj, member가 result랑 같으면, Assertions 알트엔터로 static import선택해서 Assertions없앨수 있다.
        assertThat(member).isEqualTo(result);
    }
    @Test
    public void findByName() {
        Member member1 = new Member();
        member1.setName("string1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("string2");
        repository.save(member2);

        Member result  = repository.findByName("string1").get();

        assertThat(result).isEqualTo(member1);
    }

    @Test
    public void findAll() {
        Member member1 = new Member();
        member1.setName("string1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("string2");
        repository.save(member2);

        List<Member> result = repository.findAll();

        assertThat(result.size()).isEqualTo(2);

    }



}
