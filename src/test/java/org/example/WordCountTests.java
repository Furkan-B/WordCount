package org.example;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

public class WordCountTests {

    @Test
    public void getUniqeWordCount_WhenInputIsNull_ShouldThrowIllegalArgumentException() {
        //Arrange
        WordCount wordCount = new WordCount();

        //Act
        Throwable throwable = catchThrowable( () -> wordCount.getUniqueWordCount(null));

        //Verify
        assertThat(throwable).isInstanceOf(IllegalArgumentException.class).hasMessage("null!!");
    }

    @Test
    public void getUniqueWordCount_WhenInputIsUniqeWords_ShouldReturnTotalWordCount() {
        //Arrage
        WordCount wordCount = new WordCount();

        //Act
        int result = wordCount.getUniqueWordCount("hello world");

        //Verify
        assertThat(result).isEqualTo(2);
    }

    @Test
    public void getUniqueWordCount_WhenInputIsNotUniqeWords_ShouldReturnUniqeWordCount() {
        //Arrage
        WordCount wordCount = new WordCount();

        //Act
        int result = wordCount.getUniqueWordCount("world hello world");

        //Verify
        assertThat(result).isEqualTo(2);
    }

    @Test
    public void count_WhenInputHasPunctuation_ShouldReturnUniqueWordCount() {
        //Arrange
        WordCount wordCount = new WordCount();

        //Act
        int result = wordCount.getUniqueWordCount("world. hello, .world,");

        //Verify
        assertThat(result).isEqualTo(2);
    }
}
