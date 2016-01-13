package com.shows.as.domain.adapters;

import com.shows.as.domain.enums.Moneda;

public interface ICurrencyConvertorAdapter {

    Double conversionRate(Moneda divisa, Moneda moneda);

}
