/*
	Copyright 2016 Marceau Dewilde <m@ceau.be>

	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

		http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
*/
package be.ceau.chart.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.dataset.LineDataset;
import be.ceau.chart.dataset.ScatterLineDataset;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ScatterLineData {

	private final List<String> labels = new ArrayList<String>();

	private final List<ScatterLineDataset> datasets = new ArrayList<ScatterLineDataset>();

	/**
	 * @return unmodifiable list of all labels, never {@code null}
	 */
	public List<String> getLabels() {
		return Collections.unmodifiableList(labels);
	}

	/**
	 * Sets the backing label list, replacing any labels previously added or set
	 * 
	 * @param labels
	 * @return this {@code LineData} to allow method chaining
	 */
	public ScatterLineData setLabels(Collection<String> labels) {
		this.labels.clear();
		if (labels != null) {
			this.labels.addAll(labels);
		}
		return this;
	}

	/**
	 * Sets the backing label list, replacing any labels previously added or set
	 * 
	 * @param labels
	 * @return this {@code LineData} to allow method chaining
	 */
	public ScatterLineData setLabels(String... labels) {
		this.labels.clear();
		if (labels != null) {
			this.labels.addAll(Arrays.asList(labels));
		}
		return this;
	}

	/**
	 * Adds the label to the backing label list
	 * 
	 * @return this {@code LineData} to allow method chaining
	 */
	public ScatterLineData addLabel(String label) {
		this.labels.add(label);
		return this;
	}

	/**
	 * Adds the labels to the backing label list
	 * 
	 * @return this {@code LineData} to allow method chaining
	 */
	public ScatterLineData addLabels(String... label) {
		this.labels.addAll(Arrays.asList(label));
		return this;
	}

	/**
	 * @return unmodifiable list of all {@link LineDataset} objects, never
	 *         {@code null}
	 */
	public List<ScatterLineDataset> getDatasets() {
		return Collections.unmodifiableList(datasets);
	}

	/**
	 * @return this {@code LineData} to allow method chaining
	 */
	public ScatterLineData setDatasets(Collection<ScatterLineDataset> datasets) {
		this.datasets.clear();
		if (datasets != null) {
			this.datasets.addAll(datasets);
		}
		return this;
	}

	/**
	 * @return this {@code LineData} to allow method chaining
	 */
	public ScatterLineData addDataset(ScatterLineDataset dataset) {
		this.datasets.add(dataset);
		return this;
	}

}