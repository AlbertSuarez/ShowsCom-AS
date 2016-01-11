package com.shows.as.domain.adapters;

import com.shows.as.domain.enums.Moneda;

public interface ICurrencyConvertorAdapter {

    Float conversionRate(Moneda divisa, Moneda moneda);

}
