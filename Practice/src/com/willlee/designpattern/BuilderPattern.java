package com.willlee.designpattern;

public class BuilderPattern {
	private int id;
	private int classId;
	private int schoolId;
	private String name;
	private String className;
	private String schoolName;
	private String sex;
	private String age;

	public static class Builder {
		// �ǿ���Ϣ���޶�ֵ��������ģ�
		private int id;
		private int classId;
		private int schoolId;
		// ѡ����Ϣ�����Բ���ģ�����Ĭ��Ϊ��δ�趨��
		private String name = "δ�趨";
		private String className = "δ�趨";
		private String schoolName = "δ�趨";
		private String sex = "δ�趨";
		private String age = "δ�趨";

		// builder���췽�� ���������޶����Ե�ֵ
		public Builder(int id, int classId, int schoolId) {
			this.id = id;
			this.classId = classId;
			this.schoolId = schoolId;
		}

		// �ⲿ�ṩ�����ÿ�ѡ���Ե�ֵ
		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder className(String className) {
			this.className = className;
			return this;
		}

		public Builder schoolName(String schoolName) {
			this.schoolName = schoolName;
			return this;
		}

		public Builder sex(String sex) {
			this.sex = sex;
			return this;
		}

		public Builder age(String age) {
			this.age = age;
			return this;
		}

		public BuilderPattern build() {
			return new BuilderPattern(this);
		}

	}

	// ˽�л����췽�� �ⲿ����ֱ��new student
	private BuilderPattern(Builder builder) {
		// ͨ����ֵ���ַ�������⴫���ֵ����ȷ�� ����ȷ���׳��쳣
		this.id = builder.id;
		this.classId = builder.classId;
		this.schoolId = builder.schoolId;
		this.name = builder.name;
		this.className = builder.className;
		this.schoolName = builder.schoolName;
		this.age = builder.age;
		this.sex = builder.sex;
	}

	// �ṩ���ʶ�������������ݵĽӿ�
	public int getId() {
		return id;
	}

	public int getClassId() {
		return classId;
	}

	public int getSchoolId() {
		return schoolId;
	}

	public String getName() {
		return name;
	}

	public String getClassName() {
		return className;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public String getSex() {
		return sex;
	}

	public String getAge() {
		return age;
	}

	public static void main(String[] args) {
		BuilderPattern student = new BuilderPattern.Builder(2012, 10086, 13800)
				.name("�޿�").age("20").sex("��").build();
		System.out.println("���֣�" + student.getName() + " - ѧУ����"
				+ student.getSchoolName() + " - �Ա�" + student.getSex());
	}
}
