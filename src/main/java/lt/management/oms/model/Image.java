package lt.management.oms.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "images")
public class Image extends BaseEntity {

	private String imageName;
	
	private String imageType;

	@Lob
	@JsonIgnore
	private byte[] data;

}
