package cl.springmachine.onion.domain.pokemon;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pokemon {

	private Integer id;

	private String name;

	private Integer pokedexNumber;

}
