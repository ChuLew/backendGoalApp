package com.example.codeengine.expense.model;

import javax.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "user")
public class User {
	@Id
	private Long id;

	private String name;

	private String email;
}
