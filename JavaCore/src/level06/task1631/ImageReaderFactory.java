package level06.task1631;

import level06.task1631.common.*;

public class ImageReaderFactory {
	
	public static ImageReader getImageReader(ImageTypes it) {
		if (it == null) {
			throw new IllegalArgumentException("Неизвестный тип картинки");
		}
		switch (it) {
			case BMP:
				return new BmpReader();
			case JPG:
				return new JpgReader();
			case PNG:
				return new PngReader();
			default:
				throw new IllegalArgumentException("Неизвестный тип картинки");
		}
	}
	
}
