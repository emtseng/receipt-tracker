/**
 * This class is generated by jOOQ
 */
package generated;


import generated.tables.Receipts;
import generated.tables.ReceiptsTags;
import generated.tables.Tags;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in public
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.4"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

	/**
	 * The table public.tags
	 */
	public static final Tags TAGS = generated.tables.Tags.TAGS;

	/**
	 * The table public.receipts
	 */
	public static final Receipts RECEIPTS = generated.tables.Receipts.RECEIPTS;

	/**
	 * The table public.receipts_tags
	 */
	public static final ReceiptsTags RECEIPTS_TAGS = generated.tables.ReceiptsTags.RECEIPTS_TAGS;
}
