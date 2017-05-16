local_mkfile_path:=$(abspath $(lastword $(MAKEFILE_LIST)))
local_current_dir :=$(dir $(local_mkfile_path))

MAPPING_DOCS_DIR:=$(realpath $(local_current_dir))/
MAPPING_OBJ:=$(MAPPING_DOCS_DIR)mapping.html $(MAPPING_DOCS_DIR)mapping.pdf

all: $(MAPPING_OBJ)

mappingdistclean:
	rm -f $(MAPPING_OBJ)

distclean: mappingdistclean
