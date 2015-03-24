package io.github.atimothee.rocketsolution.provider.product;

import android.net.Uri;
import android.provider.BaseColumns;

import io.github.atimothee.rocketsolution.provider.RocketProvider;
import io.github.atimothee.rocketsolution.provider.product.ProductColumns;

/**
 * A human being which is part of a team.
 */
public class ProductColumns implements BaseColumns {
    public static final String TABLE_NAME = "product";
    public static final Uri CONTENT_URI = Uri.parse(RocketProvider.CONTENT_URI_BASE + "/" + TABLE_NAME);

    /**
     * Primary key.
     */
    public static final String _ID = BaseColumns._ID;

    public static final String NAME = "name";

    public static final String SKU = "sku";

    public static final String PRICE = "price";

    public static final String BRAND = "brand";

    public static final String IMAGE = "image";


    public static final String DEFAULT_ORDER = TABLE_NAME + "." +_ID;

    // @formatter:off
    public static final String[] ALL_COLUMNS = new String[] {
            _ID,
            NAME,
            SKU,
            PRICE,
            BRAND,
            IMAGE
    };
    // @formatter:on

    public static boolean hasColumns(String[] projection) {
        if (projection == null) return true;
        for (String c : projection) {
            if (c.equals(NAME) || c.contains("." + NAME)) return true;
            if (c.equals(SKU) || c.contains("." + SKU)) return true;
            if (c.equals(PRICE) || c.contains("." + PRICE)) return true;
            if (c.equals(BRAND) || c.contains("." + BRAND)) return true;
            if (c.equals(IMAGE) || c.contains("." + IMAGE)) return true;
        }
        return false;
    }

}
