package guru.framework.jokeapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

public class JokeServiceImpl implements JokeService {
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @java.lang.Override
    public java.lang.String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
