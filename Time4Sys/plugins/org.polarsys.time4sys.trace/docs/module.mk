local_mkfile_path:=$(abspath $(lastword $(MAKEFILE_LIST)))
local_current_dir :=$(dir $(local_mkfile_path))

TRACE_DOCS_DIR:=$(realpath $(local_current_dir))/
TRACE_OBJ:= $(TRACE_DOCS_DIR)trace.html $(TRACE_DOCS_DIR)trace.pdf

all: $(TRACE_OBJ)

tracedistclean:
	rm -f  $(TRACE_OBJ)

distclean: tracedistclean

