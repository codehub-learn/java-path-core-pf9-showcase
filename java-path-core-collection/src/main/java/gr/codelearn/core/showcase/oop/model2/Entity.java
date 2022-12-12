package gr.codelearn.core.showcase.oop.model2;

public abstract class Entity {
	private Long id;

	public abstract Long getId();

	public void setId(Long id){
		this.id = id;
	}
}
