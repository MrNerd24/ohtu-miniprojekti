/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hextex.inmemory;

import hextex.references.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author ilarilai
 */
public class InMemoryReferenceDao implements ReferenceDao {

    private List<Reference> references;

    public InMemoryReferenceDao() {
        references = new ArrayList<Reference>();
    }

    @Override
    public List<Reference> listAll() {
        return references;
    }

    public void setReferences(List<Reference> references) {
        this.references = references;
    }

    public List<Reference> getReferences() {
        return references;
    }

    @Override
    public void add(Reference reference) {
        if (reference != null) {
            references.add(reference);
        }
    }

    @Override
    public void delete(String key) {
        Iterator<Reference> iterator = references.iterator();
        while (iterator.hasNext()) {
            Reference r = iterator.next();
            if (r.getKey().equals(key)) {
                references.remove(r);
            }
            break;
        }
    }
}
