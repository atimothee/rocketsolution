package io.github.atimothee.rocketsolution.provider.product;

import java.util.Date;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;

import io.github.atimothee.rocketsolution.provider.base.AbstractSelection;

/**
 * Selection for the {@code product} table.
 */
public class ProductSelection extends AbstractSelection<ProductSelection> {
    @Override
    protected Uri baseUri() {
        return ProductColumns.CONTENT_URI;
    }

    /**
     * Query the given content resolver using this selection.
     *
     * @param contentResolver The content resolver to query.
     * @param projection A list of which columns to return. Passing null will return all columns, which is inefficient.
     * @param sortOrder How to order the rows, formatted as an SQL ORDER BY clause (excluding the ORDER BY itself). Passing null will use the default sort
     *            order, which may be unordered.
     * @return A {@code ProductCursor} object, which is positioned before the first entry, or null.
     */
    public ProductCursor query(ContentResolver contentResolver, String[] projection, String sortOrder) {
        Cursor cursor = contentResolver.query(uri(), projection, sel(), args(), sortOrder);
        if (cursor == null) return null;
        return new ProductCursor(cursor);
    }

    /**
     * Equivalent of calling {@code query(contentResolver, projection, null)}.
     */
    public ProductCursor query(ContentResolver contentResolver, String[] projection) {
        return query(contentResolver, projection, null);
    }

    /**
     * Equivalent of calling {@code query(contentResolver, projection, null, null)}.
     */
    public ProductCursor query(ContentResolver contentResolver) {
        return query(contentResolver, null, null);
    }


    public ProductSelection id(long... value) {
        addEquals("product." + ProductColumns._ID, toObjectArray(value));
        return this;
    }

    public ProductSelection name(String... value) {
        addEquals(ProductColumns.NAME, value);
        return this;
    }

    public ProductSelection nameNot(String... value) {
        addNotEquals(ProductColumns.NAME, value);
        return this;
    }

    public ProductSelection nameLike(String... value) {
        addLike(ProductColumns.NAME, value);
        return this;
    }

    public ProductSelection nameContains(String... value) {
        addContains(ProductColumns.NAME, value);
        return this;
    }

    public ProductSelection nameStartsWith(String... value) {
        addStartsWith(ProductColumns.NAME, value);
        return this;
    }

    public ProductSelection nameEndsWith(String... value) {
        addEndsWith(ProductColumns.NAME, value);
        return this;
    }

    public ProductSelection sku(String... value) {
        addEquals(ProductColumns.SKU, value);
        return this;
    }

    public ProductSelection skuNot(String... value) {
        addNotEquals(ProductColumns.SKU, value);
        return this;
    }

    public ProductSelection skuLike(String... value) {
        addLike(ProductColumns.SKU, value);
        return this;
    }

    public ProductSelection skuContains(String... value) {
        addContains(ProductColumns.SKU, value);
        return this;
    }

    public ProductSelection skuStartsWith(String... value) {
        addStartsWith(ProductColumns.SKU, value);
        return this;
    }

    public ProductSelection skuEndsWith(String... value) {
        addEndsWith(ProductColumns.SKU, value);
        return this;
    }

    public ProductSelection price(String... value) {
        addEquals(ProductColumns.PRICE, value);
        return this;
    }

    public ProductSelection priceNot(String... value) {
        addNotEquals(ProductColumns.PRICE, value);
        return this;
    }

    public ProductSelection priceLike(String... value) {
        addLike(ProductColumns.PRICE, value);
        return this;
    }

    public ProductSelection priceContains(String... value) {
        addContains(ProductColumns.PRICE, value);
        return this;
    }

    public ProductSelection priceStartsWith(String... value) {
        addStartsWith(ProductColumns.PRICE, value);
        return this;
    }

    public ProductSelection priceEndsWith(String... value) {
        addEndsWith(ProductColumns.PRICE, value);
        return this;
    }

    public ProductSelection brand(String... value) {
        addEquals(ProductColumns.BRAND, value);
        return this;
    }

    public ProductSelection brandNot(String... value) {
        addNotEquals(ProductColumns.BRAND, value);
        return this;
    }

    public ProductSelection brandLike(String... value) {
        addLike(ProductColumns.BRAND, value);
        return this;
    }

    public ProductSelection brandContains(String... value) {
        addContains(ProductColumns.BRAND, value);
        return this;
    }

    public ProductSelection brandStartsWith(String... value) {
        addStartsWith(ProductColumns.BRAND, value);
        return this;
    }

    public ProductSelection brandEndsWith(String... value) {
        addEndsWith(ProductColumns.BRAND, value);
        return this;
    }

    public ProductSelection image(String... value) {
        addEquals(ProductColumns.IMAGE, value);
        return this;
    }

    public ProductSelection imageNot(String... value) {
        addNotEquals(ProductColumns.IMAGE, value);
        return this;
    }

    public ProductSelection imageLike(String... value) {
        addLike(ProductColumns.IMAGE, value);
        return this;
    }

    public ProductSelection imageContains(String... value) {
        addContains(ProductColumns.IMAGE, value);
        return this;
    }

    public ProductSelection imageStartsWith(String... value) {
        addStartsWith(ProductColumns.IMAGE, value);
        return this;
    }

    public ProductSelection imageEndsWith(String... value) {
        addEndsWith(ProductColumns.IMAGE, value);
        return this;
    }
}
