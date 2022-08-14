package tutorials.nullable.allaboutnulls.service;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

@Service
public class SampleService {

	@NonNull
	private Integer id;
	
	public void nullId() {
		this.id = null;
	}

	public void saveSampleBook() {
		System.out.println("Saving a book : "  + saveABook(null));
	}
	
	@NonNull public Integer saveABook(@NonNull String bookIbnId) {
		return null;
	}
}
