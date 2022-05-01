package org.hibernate.bugs;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "foo")
public class Foo
{
	@Id
	public int id;

	@Column(name="counter")
	public int counter = 0;
}
