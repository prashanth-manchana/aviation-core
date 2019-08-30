package com.vineeth.aviationcore.listeners;

import java.io.FileNotFoundException;

import org.springframework.batch.core.step.skip.SkipLimitExceededException;
import org.springframework.batch.core.step.skip.SkipPolicy;
import org.springframework.batch.item.file.FlatFileParseException;

public class JsonVerificationSkipper implements SkipPolicy {

	@Override
	public boolean shouldSkip(Throwable exception, int skipCount) throws SkipLimitExceededException {
		if (exception instanceof FileNotFoundException) {
			return false;
		} else if (exception instanceof RuntimeException && skipCount <= 5) {
			FlatFileParseException ffpe = (FlatFileParseException) exception;
			StringBuilder errorMessage = new StringBuilder();
			errorMessage.append("An error occured while processing of the file. Below was the faulty " + "input.\n");
			errorMessage.append(ffpe.getInput() + "\n");
			System.out.println(errorMessage.toString());
			return true;
		} else {
			return false;
		}
	}

}