package com.kh.member.controller;

import java.util.Scanner;

import com.kh.member.model.vo.Member;


public class MemberManager {
	private static Member[] m=new Member[10];
	private static int ctn=0;
	private Scanner sc=new Scanner(System.in);

	public MemberManager() {}
	public void insertMember() {
		for(int i=0; i<ctn; i++) {
			System.out.println("Id : ");
			String id=sc.next();
			System.out.println("Pwd : ");
			String pwd=sc.next();
			System.out.println("Name : ");
			String name=sc.next();
			System.out.println("Age : ");
			int age=sc.nextInt();
			System.out.println("Gender : ");
			char gender=sc.next().charAt(0);
			System.out.println("Email : ");
			String email=sc.next();

			m[i]=new Member(id,pwd,name,age,gender,email);
		}
		System.out.println("입력이 완료되었습니다. 메인 메뉴로 돌아갑니다.");
	}
	public void searchId() {
		System.out.print("검색할 아이디를 입력하세요.");
		String userId=sc.next();

		for(int i=0; i<ctn; i++) {
			if(m[i].getUserId().equals(userId)) {
				printOne(m[i]);
				break;
			} else {
				System.out.println("검색한 회원 정보가 존재하지 않습니다.");
			}
		}
	}
	public void searchName() {
		System.out.println("검색할 이름을 입력하세요.");
		String userName=sc.next();

		for(int i=0; i<ctn; i++) {
			if(m[i].getUserName().equals(userName)) {
				printOne(m[i]);
				break;
			} else {
				System.out.println("검색한 회원 정보가 존재하지 않습니다.");
			}
		}
	}
	public void searchEmail() {
		System.out.println("검색할 이메일을 입력하세요.");
		String userEmail=sc.next();

		for(int i=0; i<ctn; i++) {
			if(m[i].getEmail().equals(userEmail)) {
				printOne(m[i]);
				break;

			} else {
				System.out.println("검색한 회원 정보가 존재하지 않습니다.");
			}
		}
	}
	public void updatePwd() {
		System.out.println("수정할 회원의 아이디를 입력하세요");
		String userId=sc.next();
		int sw=0;
		int index=0;
		
		for(int i=0; i<ctn; i++) {
			if(m[i].getUserId().equals(userId)) {
				sw=1;
				index=i;
				break;
			} else {
				sw=0;
			}
		}
		if(sw==1) {
			System.out.println("변경하실 비밀번호를 입려하세요.");
			String userPwd=sc.next();
			m[index].setUserPwd(userPwd);
			System.out.println("패스워드 수정이 완료되었습니다.");
			return;
		} else { 
			System.out.println("수정할 회원이 존재하지 않습니다.");
		}
	}
	
	public void updateName() {}
	public void updataEmail() {}
	public void deleteOne() {}
	public void deleteAll() {}
	public void printAllMember() {}
	public void printOne(Member m) {
		System.out.print("ID : "+m.getUserId());
		System.out.print("Password : "+m.getUserPwd());
		System.out.print("Name : "+m.getUserName());
		System.out.print("Age : "+m.getAge());
		System.out.print("Gender : "+m.getGender());
		System.out.print("Email : "+m.getEmail());
	}

}
