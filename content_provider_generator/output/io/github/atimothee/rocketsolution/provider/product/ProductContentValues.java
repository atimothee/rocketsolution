package io.github.atimothee.rocketsolution.provider.product;

import java.util.Date;

import android.content.ContentResolver;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import io.github.atimothee.rocketsolution.provider.base.AbstractContentValues;

/**
 * Content values wrapper for the {@code product} table.
 */
public class ProductContentValues extends AbstractContentValues {
    @Override
    public Uri uri() {
        return ProductColumns.CONTENT_URI;
    }

    /**
     * Update row(s) using the values stored by this object and the given selection.
     *
     * @param contentResolver The content resolver to use.
     * @param where The selection to use (can be {@code null}).
     */
    public int update(ContentResolver contentResolver, @Nullable ProductSelection where) {
        return contentResolver.update(uri(), values(), where == null ? null : where.sel(), where == null ? null : where.args());
    }

    public ProductContentValues putName(@NonNull String value) {
        if (value == null) throw new IllegalArgumentException("name must not be null");
        mContentValues.put(ProductColumns.NAME, value);
        return this;
    }


    public ProductContentValues putSku(@NonNull String value) {
        if (value == null) throw new IllegalArgumentException("sku must not be null");
        mContentValues.put(ProductColumns.SKU, value);
        return this;
    }


    public ProductContentValues putPrice(@NonNull String value) {
        if (value == null) throw new IllegalArgumentException("price must not be null");
        mContentValues.put(ProductColumns.PRICE, value);
        return this;
    }


    public ProductContentValues putBrand(@NonNull String value) {
        if (value == null) throw new IllegalArgumentException("brand must not be null");
        mContentValues.put(ProductColumns.BRAND, value);
        return this;
    }


    public ProductContentValues putImage(@NonNull String value) {
        if (value == null) throw new IllegalArgumentException("image must not be null");
        mContentValues.put(ProductColumns.IMAGE, value);
        return this;
    }

}
