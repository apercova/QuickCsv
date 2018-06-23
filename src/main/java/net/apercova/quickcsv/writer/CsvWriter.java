package net.apercova.quickcsv.writer;

import java.io.Closeable;
import java.io.Flushable;
import java.io.Writer;
import java.util.Collection;

/**
 * Writer for Comma-Separated values in compliance with RFC 4180
 * plus custom delimiter and quoted values.
 * <pre>
 *  Common Format and MIME Type for Comma-Separated Values (CSV) Files
 *  <a href="https://tools.ietf.org/html/rfc4180" target="_blank">https://tools.ietf.org/html/rfc4180</a>
 * </pre>
 * @author <a href="https://twitter.com/apercova" target="_blank">{@literal @}apercova</a> <a href="https://github.com/apercova" target="_blank">https://github.com/apercova</a>
 * @since 1.0
 */
public interface CsvWriter<E> extends Closeable,Flushable{

	CsvWriter<E> setWriter(Writer writer);
	CsvWriter<E> setDelimiter(char delimiter);
	CsvWriter<E> setQuote(char quote);
	CsvWriter<E> autoflush(boolean autoflush);
	CsvWriter<E> setLines(Collection<E> lines);
	CsvWriter<E> addLines(Collection<E> lines);
	CsvWriter<E> addLine(E line);
	Collection<E> getLines();
	CsvWriter<E> skipHeader(boolean skipHeader);
	boolean skipHeader();
	void write() throws CsvWriterException;
}