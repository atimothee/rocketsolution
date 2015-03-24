package io.github.atimothee.rocketsolution.provider.product;

import java.util.Date;

import android.database.Cursor;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import io.github.atimothee.rocketsolution.provider.base.AbstractCursor;

/**
 * Cursor wrapper for the {@code product} table.
 */
public class ProductCursor extends AbstractCursor implements ProductModel {
    public ProductCursor(Cursor cursor) {
        super(cursor);
    }

    /**
     * Primary key.
     */
    public long getId() {
        Long res = getLongOrNull(ProductColumns._ID);
        if (res == null)
            throw new NullPointerException("The value of '_id' in the database was null, which is not allowed according to the model definition");
        return res;
    }

    /**
     * Get the {@code name} value.
     * Cannot be {@code null}.
     */
    @NonNull
    public String getName() {
        String res = getStringOrNull(ProductColumns.NAME);
        if (res == null)
            throw new NullPointerException("The value of 'name' in the database was null, which is not allowed according to the model definition");
        return res;
    }

    /**
     * Get the {@code sku} value.
     * Cannot be {@code null}.
     */
    @NonNull
    public String getSku() {
        String res = getStringOrNull(ProductColumns.SKU);
        if (res == null)
            throw new NullPointerException("The value of 'sku' in the database was null, which is not allowed according to the model definition");
        return res;
    }

    /**
     * Get the {@code price} value.
     * Cannot be {@code null}.
     */
    @NonNull
    public String getPrice() {
        String res = getStringOrNull(ProductColumns.PRICE);
        if (res == null)
            throw new NullPointerException("The value of 'price' in the database was null, which is not allowed according to the model definition");
        return res;
    }

    /**
     * Get the {@code brand} value.
     * Cannot be {@code null}.
     */
    @NonNull
    public String getBrand() {
        String res = getStringOrNull(ProductColumns.BRAND);
        if (res == null)
            throw new NullPointerException("The value of 'brand' in the database was null, which is not allowed according to the model definition");
        return res;
    }

    /**
     * Get the {@code image} value.
     * Cannot be {@code null}.
     */
    @NonNull
    public String getImage() {
        String res = getStringOrNull(ProductColumns.IMAGE);
        if (res == null)
            throw new NullPointerException("The value of 'image' in the database was null, which is not allowed according to the model definition");
        return res;
    }
}
