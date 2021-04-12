package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {

    public static ImageReader getImageReader(ImageTypes img) {
        ImageReader toReturn = null;
        if (img == null) {
            throw new IllegalArgumentException("Неизвестный тип картинки");
        } else
        {            switch(img)

    {
        case BMP:
            toReturn = new BmpReader();
            break;
        case JPG:
            toReturn = new JpgReader();
            break;
        case PNG:
            toReturn = new PngReader();
            break;
    }
}
        return toReturn;
    }
}
