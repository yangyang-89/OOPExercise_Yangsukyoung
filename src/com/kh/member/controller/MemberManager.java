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
		System.out.println("�Է��� �Ϸ�Ǿ����ϴ�. ���� �޴��� ���ư��ϴ�.");
	}
	public void searchId() {
		System.out.print("�˻��� ���̵� �Է��ϼ���.");
		String userId=sc.next();

		for(int i=0; i<ctn; i++) {
			if(m[i].getUserId().equals(userId)) {
				printOne(m[i]);
				break;
			} else {
				System.out.println("�˻��� ȸ�� ������ �������� �ʽ��ϴ�.");
			}
		}
	}
	public void searchName() {
		System.out.println("�˻��� �̸��� �Է��ϼ���.");
		String userName=sc.next();

		for(int i=0; i<ctn; i++) {
			if(m[i].getUserName().equals(userName)) {
				printOne(m[i]);
				break;
			} else {
				System.out.println("�˻��� ȸ�� ������ �������� �ʽ��ϴ�.");
			}
		}
	}
	public void searchEmail() {
		System.out.println("�˻��� �̸����� �Է��ϼ���.");
		String userEmail=sc.next();

		for(int i=0; i<ctn; i++) {
			if(m[i].getEmail().equals(userEmail)) {
				printOne(m[i]);
				break;

			} else {
				System.out.println("�˻��� ȸ�� ������ �������� �ʽ��ϴ�.");
			}
		}
	}
	public void updatePwd() {
		System.out.println("������ ȸ���� ���̵� �Է��ϼ���");
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
			System.out.println("�����Ͻ� ��й�ȣ�� �Է��ϼ���.");
			String userPwd=sc.next();
			m[index].setUserPwd(userPwd);
			System.out.println("�н����� ������ �Ϸ�Ǿ����ϴ�.");
			return;
		} else { 
			System.out.println("������ ȸ���� �������� �ʽ��ϴ�.");
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
