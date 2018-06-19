package edu.asu.diging.gilesecosystem.nereid.core.stanford.impl;

import org.springframework.stereotype.Service;

import edu.asu.diging.gilesecosystem.nereid.core.stanford.IStanfordNerProcessor;
import edu.asu.diging.gilesecosystem.requests.ICompletedStorageRequest;

@Service
public class StanfordNerProcessor implements IStanfordNerProcessor {

    /* (non-Javadoc)
     * @see edu.asu.diging.gilesecosystem.nereid.core.stanford.impl.IStanfordNerProcessor#process(edu.asu.diging.gilesecosystem.requests.ICompletedStorageRequest)
     */
    @Override
    public void process(ICompletedStorageRequest request) {
        
    }
}
