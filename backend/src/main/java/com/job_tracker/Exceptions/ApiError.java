package com.job_tracker.Exceptions;

import java.time.Instant;

public record ApiError(String code,
                       String message,
                       String path,
                       Instant timestamp,
                       String traceId) {
}
