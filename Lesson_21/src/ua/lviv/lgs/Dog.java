package ua.lviv.lgs;

public class Dog {

	@Description(params = "Dog - name annotation")
	private String name;
	@Description(params = "Dog - age annotation")
	private int age;
	@Description(params = "Dog - voice annotation")
	private String voice;
	@Description(params = "Dog - kind annotation")
	private String kind;

	public Dog(String name, int age, String voice, String kind) {
		super();
		this.name = name;
		this.age = age;
		this.voice = voice;
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getVoice() {
		return voice;
	}

	public void setVoice(String voice) {
		this.voice = voice;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", voice=" + voice + ", kind=" + kind + "]";
	}

}
