# Current currency exchange rates.
### Using API provided by [Vatcomply](https://www.vatcomply.com/documentation#vat)

**After downloading and building code successfully, run the application.**

# Endpoints

http://localhost:8080/get-exchange-rates/latest for the latest on all currencies. Which will return 
```
{
  "date": "2020-04-03",
  "base": "EUR",
  "rates": {
    "EUR": 1,
    "USD": 1.0785,
    "JPY": 117.1,
    "BGN": 1.9558,
    "CZK": 27.539,
    "DKK": 7.4689,
    "GBP": 0.8785,
    "HUF": 365.15,
    "PLN": 4.5765,
    "RON": 4.8307,
    "SEK": 10.952,
    "CHF": 1.0547,
    "ISK": 155.7,
    "NOK": 11.2628,
    "HRK": 7.63,
    "RUB": 82.8075,
    "TRY": 7.2296,
    "AUD": 1.8004,
    "BRL": 5.6893,
    "CAD": 1.5299,
    "CNY": 7.6476,
    "HKD": 8.3625,
    "IDR": 17918.68,
    "ILS": 3.9267,
    "INR": 82.216,
    "KRW": 1332.82,
    "MXN": 26.547,
    "MYR": 4.7006,
    "NZD": 1.8423,
    "PHP": 54.805,
    "SGD": 1.5489,
    "THB": 35.601,
    "ZAR": 20.2642
  }
}
```
http://localhost:8080/get-exchange-rates/currency?baseCurrency={Currency} replacing {Currency} with the currency you want. If we enter USD, it will return
```
{
  "date": "2020-04-03",
  "base": "USD",
  "rates": {
    "EUR": 0.9272137227630969,
    "USD": 1,
    "JPY": 108.57672693555864,
    "BGN": 1.813444598980065,
    "CZK": 25.534538711172928,
    "DKK": 6.925266573945294,
    "GBP": 0.8145572554473806,
    "HUF": 338.5720908669448,
    "PLN": 4.243393602225313,
    "RON": 4.479091330551692,
    "SEK": 10.154844691701436,
    "CHF": 0.9779323133982383,
    "ISK": 144.36717663421416,
    "NOK": 10.443022716736207,
    "HRK": 7.074640704682429,
    "RUB": 76.78025034770515,
    "TRY": 6.703384330088085,
    "AUD": 1.6693555864626797,
    "BRL": 5.275197032916087,
    "CAD": 1.4185442744552619,
    "CNY": 7.09095966620306,
    "HKD": 7.753824756606399,
    "IDR": 16614.44598980065,
    "ILS": 3.6408901251738524,
    "INR": 76.23180343069076,
    "KRW": 1235.8089939731108,
    "MXN": 24.614742698191932,
    "MYR": 4.358460825220213,
    "NZD": 1.7082058414464534,
    "PHP": 50.815948076031525,
    "SGD": 1.4361613351877607,
    "THB": 33.009735744089014,
    "ZAR": 18.789244320815946
  }
}
```
