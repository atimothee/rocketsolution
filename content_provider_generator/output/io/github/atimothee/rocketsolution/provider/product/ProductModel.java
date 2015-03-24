package io.github.atimothee.rocketsolution.provider.product;

import io.github.atimothee.rocketsolution.provider.base.BaseModel;

import java.util.Date;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * A human being which is part of a team.
 */
public interface ProductModel extends BaseModel {

    /**
     * Get the {@code name} value.
     * Cannot be {@code null}.
     */
    @NonNull
    String getName();

    /**
     * Get the {@code sku} value.
     * Cannot be {@code null}.
     */
    @NonNull
    String getSku();

    /**
     * Get the {@code price} value.
     * Cannot be {@code null}.
     */
    @NonNull
    String getPrice();

    /**
     * Get the {@code brand} value.
     * Cannot be {@code null}.
     */
    @NonNull
    String getBrand();

    /**
     * Get the {@code image} value.
     * Cannot be {@code null}.
     */
    @NonNull
    String getImage();
}
