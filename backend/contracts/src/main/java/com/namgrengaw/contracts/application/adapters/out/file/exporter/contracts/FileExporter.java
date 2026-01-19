package com.namgrengaw.contracts.application.adapters.out.file.exporter.contracts;

import com.namgrengaw.contracts.application.exceptions.FileExportException;
import org.springframework.core.io.Resource;

import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public interface FileExporter {

    Resource exportFile(String title, String[] headers, List<Map<String, String>> content) throws FileExportException;

}
