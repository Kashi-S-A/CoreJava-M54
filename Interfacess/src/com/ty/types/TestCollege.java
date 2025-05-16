package com.ty.types;

public class TestCollege {

	public static void main(String[] args) {
		College college = new College() {

			@Override
			public void exam() {
				System.out.println("Exams started in college");
			}

			@Override
			public void sports() {
				System.out.println("playing sports");
			}

		};

		college.exam();///Exams started in college
		college.sports();//playing sports
	}
}
