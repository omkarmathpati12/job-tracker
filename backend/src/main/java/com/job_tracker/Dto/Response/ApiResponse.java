package com.job_tracker.Dto.Response;

import java.io.Serializable;

public record ApiResponse(boolean success,
                          String message)  {
}
