package com.exchangeRate.exchangeRate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.sql.SQLOutput;


@RestController
@RequestMapping("/get-exchange-rates")
public class ExchangeRateController {
    private ExchangeRateResponse exchangeRateResponse;
    private final WebClient webClient;

    public ExchangeRateController(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://api.vatcomply.com").build();
    }

    @GetMapping("/latest")
    public Mono<ExchangeRateResponse> getLatestExchangeRates(@RequestParam(name = "baseCurrency", defaultValue = "EUR") String baseCurrency) {

        return webClient.get()
                .uri("/rates")
                .retrieve()
                .bodyToMono(ExchangeRateResponse.class)
                .onErrorReturn(new ExchangeRateResponse());
    }

    @GetMapping("/currency")
    public Mono<ExchangeRateResponse> getLatestExchangeRatesByBase(@RequestParam(name = "baseCurrency") String baseCurrency) {

        return webClient.get()
                .uri("/rates?base={baseCurrency}", baseCurrency.toUpperCase())
                .retrieve()
                .bodyToMono(ExchangeRateResponse.class)
                .onErrorReturn(new ExchangeRateResponse());
    }
}