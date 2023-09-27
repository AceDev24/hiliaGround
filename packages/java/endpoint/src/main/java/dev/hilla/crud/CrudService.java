package dev.hilla.crud;

import java.util.List;

import dev.hilla.Nullable;
import dev.hilla.crud.filter.Filter;
import org.springframework.data.domain.Pageable;

/**
 * A browser-callable service that can create, read and update a given type of
 * object.
 * <p>
 * Note! Not yet fully implemented but limited to read operations
 */
public interface CrudService<T, ID> {

    /**
     * Lists objects of the given type using the paging and sorting options
     * provided in the parameter.
     *
     * @param pageable
     *            contains information about paging and sorting
     * @param filter
     *            the filter to apply or {@code null} to not filter
     * @return a list of objects or an empty list if no objects were found
     */
    List<T> list(Pageable pageable, @Nullable Filter filter);

    /**
     * Saves the given object and returns the (potentially) updated object.
     * <p>
     * If you store the object in a SQL database, the returned object might have
     * a new id or updated consistency version.
     *
     * @param value
     *            the object to save
     * @return the fresh object or {@code null} if no object was found to update
     */
    @Nullable
    T save(T value);

    /**
     * Delets the object with the given id.
     *
     * @param id
     *            the id of the object to delete
     */
    void delete(ID id);
}
